package de.adito.rruleparser.text.formatting;




import de.adito.rruleparser.translation.IFragmentTranslator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;

/**
 * @author: luckylau
 * @Date: 2021/3/12 19:40
 * @Description:
 */
public class ChineseDateFormatting implements IDateFormatting {

    private IFragmentTranslator fragmentTranslator;

    public ChineseDateFormatting(IFragmentTranslator fragmentTranslator) {
        this.fragmentTranslator = fragmentTranslator;
    }

    @Override
    public String formatFullDate(LocalDate pLocalDate) {
        return pLocalDate.format(DateTimeFormatter.ofPattern(
                "yyyy年MM月dd日", fragmentTranslator.getCompatibleLocale()));
    }

    @Override
    public String formatMonthDay(MonthDay pMonthDay) {
        return pMonthDay.format(DateTimeFormatter.ofPattern(
                "MM月dd日", fragmentTranslator.getCompatibleLocale()));
    }

    @Override
    public String formatMonth(Month pMonth) {
        return pMonth.getDisplayName(TextStyle.FULL, fragmentTranslator.getCompatibleLocale());
    }

    @Override
    public String formatDay(DayOfWeek pDayOfWeek) {
        return pDayOfWeek.getDisplayName(TextStyle.FULL, fragmentTranslator.getCompatibleLocale());
    }

    @Override
    public String formatDayShort(DayOfWeek pDayOfWeek) {
        return pDayOfWeek.getDisplayName(TextStyle.SHORT, fragmentTranslator.getCompatibleLocale());
    }
}
