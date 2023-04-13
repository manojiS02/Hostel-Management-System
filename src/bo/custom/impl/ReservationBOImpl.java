package bo.custom.impl;

import bo.custom.ReservationBO;
import dto.ReservationDTO;
import dto.StudentDTO;

import java.io.IOException;
import java.util.ArrayList;

public class ReservationBOImpl implements ReservationBO {
    @Override
    public boolean save(ReservationDTO reservationDTO) throws Exception {
        return false;
    }

    @Override
    public boolean update(ReservationDTO reservationDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<ReservationDTO> getAll() throws Exception {
        return null;
    }

    @Override
    public boolean studentExist(String id) throws Exception {
        return false;
    }

    @Override
    public StudentDTO search(String id) {
        return null;
    }

    @Override
    public String generateNewReservationID() throws IOException {
        return null;
    }
}
