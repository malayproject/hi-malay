package com.malay.Hi-Malay

class Hi-Malay  {

  private String hi;
  private String name;

  public Hi-Malay (){}

  public Hi-Malay (String name) {
    this.name = name;
  }
  
  public String getName() {
  return this.name;
  }
  
  public void setName(String newName) {
  this.name = newName;
  }

  public void sayHi() {
    System.out.println("Hi-Malay");
  }

}
