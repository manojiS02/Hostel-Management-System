package bo.custom.impl;

import bo.custom.StudentBO;
import dto.StudentDTO;

import java.io.IOException;
import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {

    @Override
    public boolean save(StudentDTO studentDTO) throws Exception {
        return false;
    }

    @Override
    public boolean update(StudentDTO studentDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        return null;
    }

    @Override
    public boolean studentExist(String id) throws Exception {
        return false;
    }

    @Override
    public StudentDTO search(String id) throws IOException {
        return null;
    }

    @Override
    public String generateNewStudentID() {
        return null;
    }
}
