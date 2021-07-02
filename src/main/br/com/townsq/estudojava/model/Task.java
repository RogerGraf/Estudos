package main.br.com.townsq.estudojava.model;

import java.util.List;

import main.br.com.townsq.estudojava.define.TaskStatus;

public class Task {
  List<User> users;
  String title;
  String description;
  TaskStatus status;
}
