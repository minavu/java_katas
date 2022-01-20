package edu.pdx.cs410J.VNteam;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void testMainWithArgumentDivideBy400() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2000");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Bingo"));
  }

  @Test
  void testMainWithArgumentIsNotLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "1991");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Oops"));
  }

  @Test
  void testMainWithArgumentDivideBy4Not100() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "20");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Bingo"));
  }

  @Test
  void testMainWithArgumentDivideBy100Not400() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2200");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Oops"));
  }

}
