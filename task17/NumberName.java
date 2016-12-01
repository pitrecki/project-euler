package task17;

/**
 * Created by Pitrecki on 2016-10-03.
 */
public enum NumberName
{
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
    TEN, ELEVEN, TWELVE, THIRTEEN, FOURTEEN, FIVETEEN, SIXTEEN, EIGHTEEN, NINETEEN,
    TWEBTY, THIRY, FOURTY, FIFTY, SIXTY, SEVENTY, EIGHTY, NINETY,
    HUNDRED,
    THOUSAND;



    public String choose() {
        switch (this) {
            case ONE:
                return "One";
            case TWO:
                return "TWO";
            case THREE:
                return "THREE";
            case FOUR:
                return "FOUR";
            case FIVE:
                return "FIVE";
            case SIX:
                return "SIX";
            case SEVEN:
                return "SEVEN";
            case EIGHT:
                return "EIGHT";
            case NINE:
                return "NINE";
            case TEN:
                return "TEN";
            case ELEVEN:
                return "ELEVEN";
            case TWELVE:
                return "TWELVE";
            case THIRTEEN:
                return "THIRTEEN";
            case FOURTEEN:
                return "FOURTEEN";
            case FIVETEEN:
                return "FIVETEEN";
            case SIXTEEN:
                return "SIXTEEN";
            case EIGHTEEN:
                return "EIGHTEEN";
            case NINETEEN:
                return "NINETEEN";
            case TWEBTY:
                return "TWENTY";
            case THIRY:
                return "THIRTY";
            case FOURTY:
                return "FORTY";
            case FIFTY:
                return "FIFTY";
            case SIXTY:
                return "SIXTY";
            case SEVENTY:
                return "SEVENTY";
            case EIGHTY:
                return "EIGHTY";
            case NINETY:
                return "NINETY";
            case HUNDRED:
                return "HUNDRED";
            case THOUSAND:
                return "THOUSAND";
            default:
                return "AND";
        }
    }
}
