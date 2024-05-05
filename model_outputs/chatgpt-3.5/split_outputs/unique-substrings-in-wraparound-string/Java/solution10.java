import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> substrings = new HashSet<>();
        Pattern pattern = Pattern.compile("a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            substrings.add(matcher.group());
        }
        return substrings.size();
    }
}
