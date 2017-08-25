package study.ioc.knight;
import static org.mockito.Mockito.*;

import org.junit.Test;

import spring.ioc.knight.BraveKnight;
import spring.ioc.knight.Quest;



public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }

}
