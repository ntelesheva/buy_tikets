package service;


import com.kiev.tickets.entity.Event;
import com.kiev.tickets.entity.Ticket;
import com.kiev.tickets.entity.User;
import dao.EventDao;
import dao.TicketDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TicketService {
    private TicketDao ticketDao;
    private EventDao eventDao;
    private  DataTimeService dataTimeService;


    public boolean createTicket(User user, Integer eventId) {
        Event event = eventDao.findById(eventId);
        return ticketDao.save(Ticket.builder()
                .user(user)
                .event(event)
                .dataOfBuy(dataTimeService.getLocalDataTime())
                .build());
    }


}
