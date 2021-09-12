package de.adito.rruleparser.tokenizer;

import de.adito.rruleparser.RRuleParser;
import de.adito.rruleparser.text.ChineseTextBuilder;
import de.adito.rruleparser.tokenizer.exception.RRuleTokenizeException;
import de.adito.rruleparser.translation.LanguagePackageFragmentTranslator;
import de.adito.rruleparser.translation.language.ChineseTranslation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChineseRRuleParserTest
{
  @Test
  @DisplayName("Test the parser from the entry point")
  void testGeneralFunctionality() throws RRuleTokenizeException
  {
    // Creates a rrule parser with english translation
    RRuleParser ruleParser = new RRuleParser(new ChineseTextBuilder(new LanguagePackageFragmentTranslator(new ChineseTranslation())));


    String parseResult = ruleParser.parseRRule("FREQ=MONTHLY;BYSETPOS=4;BYDAY=SU;INTERVAL=5");

    assertEquals("每5月的第4个星期日重复", parseResult);

  }
}