package com.tao.modules.tag;

import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.Message;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagService  tagService;

    @PostMapping("/")
    public Message create(@RequestBody SimpleMap params){
        System.out.println(params);
        return new Message(Message.STATUS_OK);
    }
    @PostMapping("/delete")
    public Message delete(@RequestBody SimpleMap params){
        System.out.println(params);
        return new Message(Message.STATUS_OK);
    }
    @PostMapping("/update")
    public Message update(@RequestBody SimpleMap params){
        System.out.println(params);
        return  new Message(Message.STATUS_OK);
    }
    @PostMapping("/list")
    public Message list(@RequestBody SimpleMap params){
        System.out.println(params);
        GridPage result = tagService.list(params);
        return new Message(Message.STATUS_OK).setResult(result);
    }
}
