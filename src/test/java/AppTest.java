import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Coin Exchange");
  }

  @Test
  public void fourPennies() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("4 penny(s)");
  }

  @Test
  public void oneNickle() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("9");
    submit(".btn");
    assertThat(pageSource()).contains("1 nickel");
  }

  @Test
  public void twoDimesAndThreePennies() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("23");
    submit(".btn");
    assertThat(pageSource()).contains("2 dime(s), 3 penny(s)");
  }

  @Test
  public void threeQuarterstwoDimesthreePennies() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("98");
    submit(".btn");
    assertThat(pageSource()).contains("3 quarter(s), 2 dime(s), 3 penny(s)");
  }

}
