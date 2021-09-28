import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com.rowan.Tester;
import org.junit.Test;

public class TesterATest {

  @Test
  public void testATest() {
    int num = Tester.TestA();
    assertThat(num, equalTo(4));
  }

}
