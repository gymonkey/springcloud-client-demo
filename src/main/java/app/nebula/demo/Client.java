package app.nebula.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="client",url = "http://network-417-0.default:8080/")
public interface Client {
    @RequestMapping(method = RequestMethod.GET, value = "/echo/{name}")
    String echo(@PathVariable("name") String name);

}
