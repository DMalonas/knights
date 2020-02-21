import static org.mockito.Mockito.*;

import com.springinaction.knights.Minstrel;
import org.junit.Test;
import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        Minstrel mockMinstrel = mock(Minstrel.class);
        BraveKnight knight = new BraveKnight(mockQuest, mockMinstrel);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
