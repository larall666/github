package com.sb.sb_coingecko.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sb.sb_coingecko.Model.CoinData;
import com.sb.sb_coingecko.service.ApiService;


@Controller
public class CoinDataController {
  @Autowired
  private ApiService apiService;



  @GetMapping("/coin-data")
  public String displayExternalData(Model model){
  List<CoinData> coinDataList = apiService.fetchCoinData();
  model.addAttribute("coinDataList",coinDataList);
  return "coins3";//http://localhost:8101/coin-data
}
}
