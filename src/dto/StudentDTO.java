package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    String studentID;
    String name;
    String address;
    String contactNo;
    LocalDate DOB;
    String gender;
}
