/**
 * Copyright 2016 Erik Jhordan Rey.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jhordan.people_mvvm.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class People implements Serializable {
  @SerializedName("nat")
  private String nat;

  @SerializedName("gender")
  private String gender;

  @SerializedName("phone")
  private String phone;

  @SerializedName("dob")
  private Dob dob;

  @SerializedName("name")
  private Name name;

  @SerializedName("registered")
  private Registered registered;

  @SerializedName("location")
  private Location location;

  @SerializedName("id")
  private Id id;

  @SerializedName("login")
  private Login login;

  @SerializedName("cell")
  private String cell;

  @SerializedName("email")
  private String email;

  @SerializedName("picture")
  private Picture picture;

  public String getNat(){
    return nat;
  }

  public String getGender(){
    return gender;
  }

  public String getPhone(){
    return phone;
  }

  public Dob getDob(){
    return dob;
  }

  public Name getName(){
    return name;
  }

  public Registered getRegistered(){
    return registered;
  }

  public Location getLocation(){
    return location;
  }

  public Id getId(){
    return id;
  }

  public Login getLogin(){
    return login;
  }

  public String getCell(){
    return cell;
  }

  public String getEmail(){
    return email;
  }

  public Picture getPicture(){
    return picture;
  }


  public static String fullName="";


  public boolean hasEmail() {
    return email != null && !email.isEmpty();
  }
}
