package service;

import com.kiev.tickets.entity.Event;
import dao.EventDao;

public class EventService {
    private EventDao eventDao;

    public boolean createEvent(Event event){
        return eventDao.save(event);
    }
}
