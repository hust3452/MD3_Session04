package ra.mvc.configs;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

public class DispatcherServletlnit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //cac cau hinh khong lien quan toi web
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //cau hinh servlet lien quan toi web
        return new Class[]{Appconfigs.class};
    }

    @Override
    protected String[] getServletMappings() {
        //anh xa duong dan
        return new String[]{"/"};
    }

    //cau hinh utf-8
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("utf-8",true);
       return new Filter[]{filter};
    }

}
