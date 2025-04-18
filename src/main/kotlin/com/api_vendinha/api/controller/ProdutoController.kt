package com.api_vendinha.api.controller

import com.api_vendinha.api.domain.dtos.request.ProdutoRequestDto
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto
import com.api_vendinha.api.domain.service.ProdutoServiceInterface
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/produto")
class ProdutoController (
    val produtoServiceInterface: ProdutoServiceInterface
) {

    @PostMapping("/save")
    fun save(@RequestBody produtoRequestDto: ProdutoRequestDto) : ProdutoResponseDto {
        return produtoServiceInterface.save(produtoRequestDto)
    }

}