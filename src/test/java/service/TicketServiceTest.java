package service;

import com.kiev.tickets.entity.Event;
import com.kiev.tickets.entity.Ticket;
import com.kiev.tickets.entity.User;
import dao.EventDao;
import dao.TicketDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class TicketServiceTest {

    private static final LocalDateTime DATE_TIME = LocalDateTime.of(2018, 9, 27, 12, 30, 30);
    @Mock
    EventDao eventDao;

    @Mock
    TicketDao ticketDao;

    @Mock
    DataTimeService dataTimeService;

    @InjectMocks
    TicketService ticketService;



    @Test
    public void shouldReturnTrueWhenCreateTicket() {
        User user = User.builder().email("email").password("123").build();
        Event event =  mock(Event.class);
        Ticket ticket = Ticket.builder().user(user).event(event).dataOfBuy(DATE_TIME).build();
        when(dataTimeService.getLocalDataTime()).thenReturn(DATE_TIME);
        when(eventDao.findById(1)).thenReturn(event);
        when(ticketDao.save(ticket)).thenReturn(true);

        assertThat(ticketService.createTicket(user, 1)).isTrue();
    }


}