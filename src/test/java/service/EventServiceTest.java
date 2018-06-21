package service;

import com.kiev.tickets.entity.Event;
import dao.EventDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class EventServiceTest {

    @Mock
    EventDao eventDao;

    @InjectMocks
    EventService eventService;

    @Test
    public void shouldReturnTrueWhenCreateEvent() {
        Event event = mock(Event.class);
        when(eventDao.save(event)).thenReturn(true);

        assertThat(eventService.createEvent(event)).isTrue();
    }

}