package de.sao.muc.maritimeusecasecapture.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectResource {

    @GetMapping("/{nickname}")
    public List<String> getMe(@PathVariable String nickname) {
        List<String> list = new ArrayList<>();
        list.add("PROJECT 1" + nickname);
        list.add("PROJECT 2" + nickname);
        list.add("PROJECT 3" + nickname);
        list.add("PROJECT 4" + nickname);

        return list;
    }
}
