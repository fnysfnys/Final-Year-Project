var findSubstringInWraproundString = function(s) {
    const consecutiveChars = s.match(/a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*/g) || [];
    return consecutiveChars.reduce((total, str) => total + str.length, 0);
};