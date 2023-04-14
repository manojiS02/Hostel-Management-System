package bo.custom.impl;

import bo.custom.ReservationBO;
import dao.DAOFactory;
import dao.custom.ReservationDAO;
import dto.ReservationDTO;
import dto.StudentDTO;
import entity.Reservation;

import java.io.IOException;
import java.util.ArrayList;

public class ReservationBOImpl implements ReservationBO {

    private final ReservationDAO reservationDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.RESERVATION);
    @Override
    public boolean save(ReservationDTO reservationDTO) throws Exception {
        return reservationDAO.save(new Reservation(
                reservationDTO.getResID(),
                reservationDTO.getDate(),
                reservationDTO.getStudentID(),
                reservationDTO.getRoomTypeID(),
                reservationDTO.getStatus()
        ));
    }

    @Override
    public boolean update(ReservationDTO reservationDTO) throws Exception {
        return reservationDAO.update(new Reservation(
                reservationDTO.getResID(),
                reservationDTO.getDate(),
                reservationDTO.getStudentID(),
                reservationDTO.getRoomTypeID(),
                reservationDTO.getStatus()
        ));
    }

    @Override
    public boolean delete(String id) throws Exception {
        return reservationDAO.delete(id);
    }

    @Override
    public ArrayList<ReservationDTO> getAll() throws Exception {
        ArrayList<ReservationDTO> allReservation = new ArrayList<>();
        ArrayList<Reservation> all = (ArrayList<Reservation>) reservationDAO.getAll();
        for (Reservation reservartion: all) {
            allReservation.add(new ReservationDTO(reservartion.getRes_ID(),reservartion.getDate(),reservartion.getStudentID(),reservartion.getRoomTypeID(),reservartion.getStatus()));
        }
        return allReservation;
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
        return reservationDAO.generateNewID();
    }
}
