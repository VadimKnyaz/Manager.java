public class UrlcheckProtocol {
    public static String checkProtocol(String url) {
        if (url.startsWith("https")) {
            return "https";
        } else {
            if (url.startsWith("http")) {
                return "http";
            } else {
                return "неизвестный";
            }
        }
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ru")) {
            return "ru";

        } else {
            return "неизвестный";
        }
    }

    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (int i = 0; i < urls.length ; i++) {
            System.out.println(urls [i]);
            System.out.println(checkDomain(urls[i]));
            System.out.println(checkProtocol(urls[i]));
        }

    }
}
//    строки методы,задачу дорешать,предыдущая с помощью массива и цикла любым другим
//            com,net,org или ru,