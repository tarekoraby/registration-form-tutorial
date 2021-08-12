package com.example.application;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Main Bean class that we build the form for.
 * <p>
 * Uses Bean Validation (JSR-303) annotations for automatic validation.
 */
public class UserDetails {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    @Email
    private String email;

    private boolean allowsMarketing;

    // FIXME Passwords should never be stored in plain text!
    @Size(min = 8, max = 64, message = "Password must be 8-64 char long")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAllowsMarketing() {
        return allowsMarketing;
    }

    public void setAllowsMarketing(boolean allowsMarketing) {
        this.allowsMarketing = allowsMarketing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}