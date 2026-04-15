package edu.zavada.service;

import edu.zavada.model.Item;
import edu.zavada.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> getAll() {
        return itemRepository.findAll();
    }
}
