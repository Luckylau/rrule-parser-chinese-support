package de.adito.rruleparser.translation.language;



import de.adito.rruleparser.translation.ETranslationFragment;

import java.util.Locale;

/**
 * @author: luckylau
 * @Date: 2021/3/12 17:40
 * @Description:
 */
public class ChineseTranslation implements ILanguagePackage {


    @Override
    public String getFragment(ETranslationFragment pTranslationFragment) {
        switch (pTranslationFragment) {
            case DAILY:
                return "每天";
            case WEEKLY:
                return "每周";
            case MONTHLY:
                return "每月";
            case YEARLY:
                return "每天";
            case DAYS:
                return "天";
            case WEEKS:
                return "周";
            case MONTHS:
                return "月";
            case YEARS:
                return "年";
            case DAY:
                return "第";
            case FIRST:
                return "第1个";
            case SECOND:
                return "第2个";
            case THIRD:
                return "第3个";
            case FOURTH:
                return "第4个";
            case LAST:
                return "最后1个";
            case UNTIL:
                return "直到";
            case TIMES:
                return "次";
            case ON:
                return "的";
            case EVERY:
                return "每";
            case OF:
                return "的";
            default:
                return "";
        }
    }

    @Override
    public Locale getCompatibleLocale() {
        return Locale.CHINA;
    }
}
