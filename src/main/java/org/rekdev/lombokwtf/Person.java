package org.rekdev.lombokwtf;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class Person {
  @NonNull
  private final String firstName;
  @NonNull
  private final String lastName;
  private final Date dateOfBirth;

}
