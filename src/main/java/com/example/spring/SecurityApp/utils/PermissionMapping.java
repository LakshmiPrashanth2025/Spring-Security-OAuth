package com.example.spring.SecurityApp.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.example.spring.SecurityApp.entities.enums.Permission;
import com.example.spring.SecurityApp.entities.enums.Role;

import static com.example.spring.SecurityApp.entities.enums.Permission.*;
import static com.example.spring.SecurityApp.entities.enums.Role.*;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PermissionMapping {

    private static final Map<Role, Set<Permission>> map = Map.of(
            USER, Set.of(USER_VIEW, POST_VIEW),
            CREATOR, Set.of(POST_CREATE, USER_UPDATE, POST_UPDATE),
            ADMIN, Set.of(POST_CREATE, USER_UPDATE, POST_UPDATE, USER_DELETE, USER_CREATE, POST_DELETE)
    );

    public static Set<SimpleGrantedAuthority> getAuthoritiesForRole(Role role) {
        return map.get(role).stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .collect(Collectors.toSet());
    }

}
