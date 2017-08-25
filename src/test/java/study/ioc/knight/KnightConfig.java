package study.ioc.knight;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ioc.knight.BraveKnight;
import spring.ioc.knight.Knight;
import spring.ioc.knight.Quest;
import spring.ioc.knight.SlayDragonQuest;



@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  @Bean
  public Quest quest() {
    return new SlayDragonQuest(stream());
  }

  @Bean
  public PrintStream stream() {
    return new FakePrintStream();
  }

}
