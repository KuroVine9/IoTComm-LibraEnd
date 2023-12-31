package com.kuro9.libraend.router

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RootRoute {

    @GetMapping("member/signup")
    fun memberSingUp() = "member/signup"

    @GetMapping("member/login")
    fun memberLogin() = "member/login"

    @GetMapping("library/seat-list")
    fun seatList() = "library/seat-list"

    @GetMapping("library/login")
    fun libraryLogin() = "library/start-use"

    @GetMapping("admin/manage")
    fun adminPage() = "admin/seat-manage"

    @GetMapping("admin/add-seat")
    fun addSeat() = "admin/add-seat"

    @GetMapping("admin/add-desk")
    fun addDesk() = "admin/add-desk"
}