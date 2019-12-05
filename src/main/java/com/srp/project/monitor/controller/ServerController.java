package com.srp.project.monitor.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.srp.framework.web.controller.BaseController;
import com.srp.framework.web.domain.AjaxResult;
import com.srp.framework.web.domain.Server;

/**
 * 服务器监控
 * 
 * @author srp
 */
@RestController
@RequestMapping("/monitor/server")
public class ServerController extends BaseController
{
    @PreAuthorize("@ss.hasPermi('monitor:server:list')")
    @GetMapping()
    public AjaxResult getInfo() throws Exception
    {
        Server server = new Server();
        server.copyTo();
        return AjaxResult.success(server);
    }
}
