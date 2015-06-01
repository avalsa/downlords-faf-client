package com.faforever.client.chat;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ChatUser {

  private StringProperty username;
  private BooleanProperty isModerator;

  public ChatUser(String username) {
    this(username, false);
  }

  public ChatUser(String username, boolean isModerator) {
    this.username = new SimpleStringProperty(username);
    this.isModerator = new SimpleBooleanProperty(isModerator);
  }

  public String getUsername() {
    return username.get();
  }

  public StringProperty usernameProperty() {
    return username;
  }

  public void setUsername(String username) {
    this.username.set(username);
  }

  @Override
  public int hashCode() {
    return username.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof ChatUser
        && username.equals(obj);
  }
}
