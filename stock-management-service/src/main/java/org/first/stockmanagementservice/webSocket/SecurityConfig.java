//package org.first.stockmanagementservice.webSocket;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                // Configure authorization for HTTP requests
//                .authorizeHttpRequests(authorize -> authorize
//                        // Allow access to specific endpoints without authentication
//                        .requestMatchers("/", "/ws/**", "/login", "/stock-management-service/croptops").permitAll()
//                        .anyRequest().authenticated() // All other requests require authentication
//                )
//                // Form-based login configuration
//                .formLogin(form -> form
//                        .loginPage("/login") // Custom login page
//                        .defaultSuccessUrl("/", true) // Redirect to root after successful login
//                        .permitAll() // Permit access to the login page
//                )
//                // Configure logout settings
//                .logout(logout -> logout
//                        .logoutSuccessUrl("/") // Redirect to "/" after successful logout
//                        .permitAll() // Allow everyone to access the logout
//                )
//                // Disable CSRF for the endpoints to allow POST requests without CSRF token
//                .csrf().disable(); // Disable CSRF protection to allow POST requests from Postman or other clients
//
//        return http.build();
//    }
//
//    // Configure in-memory authentication for simplicity
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder() // Only for testing; not secure for production
//                .username("test")
//                .password("test")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//}
