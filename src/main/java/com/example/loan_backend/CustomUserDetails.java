package com.example.loan_backend;

import com.example.loan_backend.models.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

  private String username;
  private String password;
  private List<GrantedAuthority> roles;
  private User user;

  public User getUser() {
    return this.user;
  }

  public CustomUserDetails(User user) {
    this.username = user.getEmail();
    this.password = user.getPassword();
    this.roles = Arrays.asList(user.getRole().split(",")).stream().map(SimpleGrantedAuthority::new)
        .collect(Collectors.toList());
    this.user = user;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return roles;
  }

  @Override
  public String getPassword() {
    return this.password;
  }

  @Override
  public String getUsername() {
    return this.username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
