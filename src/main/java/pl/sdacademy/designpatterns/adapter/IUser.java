package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public interface IUser {

    String getFullname();
    String getUsername();
    int getAge();
    List<String> getRoles();
}
