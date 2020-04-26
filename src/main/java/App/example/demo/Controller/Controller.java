package App.example.demo.Controller;

import App.example.demo.model.model;
import App.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }
    @RequestMapping(value = "/Register",method = RequestMethod.GET)
    public ModelAndView register()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userForm",new model());
        modelAndView.setViewName("home");
        return modelAndView;
    }
    @RequestMapping(value = "/Register",method = RequestMethod.POST)
    public ModelAndView registerPost(@ModelAttribute("userForm") model userForm)
    {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("home");
       service.save(userForm);
       return modelAndView;
    }
}
