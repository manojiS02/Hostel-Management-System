package bo.custom.impl;

import bo.custom.RoomBO;
import dto.RoomDTO;

import java.io.IOException;
import java.util.ArrayList;

public class RoomBOImpl implements RoomBO {
    @Override
    public boolean save(RoomDTO roomDTO) throws Exception {
        return false;
    }

    @Override
    public boolean update(RoomDTO roomDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<RoomDTO> getAll() throws Exception {
        return null;
    }

    @Override
    public boolean roomExist(String id) throws Exception {
        return false;
    }

    @Override
    public RoomDTO search(String id) throws IOException {
        return null;
    }

    @Override
    public String generateNewRoomID() {
        return null;
    }
}
