package com.scrap.controllers;

import com.scrap.dtos.OrderDto;
import com.scrap.services.orders.FinderOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/orders")
public class OrderController {

    protected final FinderOrderService finderOrderService = new FinderOrderService();

    private static Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("")
    //@PreAuthorize("permitAll()")
    //public ResponseEntity<List<OrderDto>> index()
    public ResponseEntity<?> index(@RequestParam(value = "search", required = false) String search)
    {
        return ResponseEntity.status(HttpStatus.OK).body(this.finderOrderService.index(search));

//        OrderDto order = new OrderDto();
//
//        logger.debug("wwwww " + order.client);
//        logger.debug("aqui");
//        return ResponseEntity.ok(Arrays.asList(new OrderDto(), new OrderDto()));
    }

    @GetMapping("/{id}")
    //@PreAuthorize("permitAll()")
    public ResponseEntity<OrderDto> show() {
        return ResponseEntity.ok(new OrderDto());
    }
}
