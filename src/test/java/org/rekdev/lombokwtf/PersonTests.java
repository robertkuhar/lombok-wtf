package org.rekdev.lombokwtf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class PersonTests {
  @Test
  public void PersonTestEqualsContract() throws Exception {
    Person p0 = new Person("Robert", "Kuhar", new Date(64,6,18));
    Person p1 = new Person("Robert","Kuhar", new Date(64,6,18));
    Person p2 = new Person("Chloe", "Kuhar", new Date(99,5,6));

    assertEquals(p0,p1);
    assertEquals(p0.hashCode(),p1.hashCode());
    assertNotEquals(p1,p2);
    assertNotEquals(p1.hashCode(),p2.hashCode());
  }

  @Test(expected = NullPointerException.class)
  public void testNonNull() throws Exception {
    Person prince = new Person("Prince", null, new Date(58, 5,7));
  }
}
