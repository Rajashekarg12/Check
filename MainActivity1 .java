public class CookieExample {
    public void setCookie(String userToken) {
        Cookie myCookie = new Cookie('userToken', userToken, null, -1, false);
        ApexPages.currentPage().setCookies(new Cookie[]{myCookie});
    }
}
