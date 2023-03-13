package cw_3;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {
    String fio;
    Integer group;
    Integer money;
    List<Integer> count;
}
