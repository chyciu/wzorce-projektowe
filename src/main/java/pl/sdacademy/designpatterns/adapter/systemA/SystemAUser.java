package pl.sdacademy.designpatterns.adapter.systemA;

import java.util.Set;

public class SystemAUser {

    private String fullName;
    private String displayName;
    private Integer age;
    private Set<String> roles;

    public SystemAUser(final String fullName, final String displayName, final Integer age, final Set<String> roles) {
        this.fullName = fullName;
        this.displayName = displayName;
        this.age = age;
        this.roles = roles;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "SystemAUser{" +
                "fullName='" + fullName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", age='" + age + '\'' +
                ", roles=" + roles +
                '}';
    }

}
