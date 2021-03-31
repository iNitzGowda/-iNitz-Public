package org.upgrad.upstac.testrequests;

import lombok.Getter;
import lombok.Setter;
import org.upgrad.upstac.users.models.Gender;


@Getter
@Setter

public class TestRequestInput {

   // {"name":"userx","gender":"MALE","address":"some address ,some day","age":40,"email":"userxx@upgrad.com","phoneNumber":"32589235","pinCode":343242}

    String name;
    Gender gender;
    String address;
    Integer age;
    String email;
    String phoneNumber;
    Integer pinCode;

}
