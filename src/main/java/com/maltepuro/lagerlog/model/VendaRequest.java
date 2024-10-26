package com.maltepuro.lagerlog.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VendaRequest {
    private List<Carrinho> carrinho;
    private String modoPagamento;
}
