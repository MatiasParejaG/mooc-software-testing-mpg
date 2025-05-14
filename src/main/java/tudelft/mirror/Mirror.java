package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        StringBuilder mirror = new StringBuilder();

        int begin = 0;
        int end = string.length() - 1;
        while (begin <= end) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror.append(string.charAt(begin));
                begin++;
                end--;
            } else {
                break;
            }
        }

        // Si llegamos al medio sin romper el espejo, devolver la cadena completa
        return (begin > end) ? string : mirror.toString();
    }
}