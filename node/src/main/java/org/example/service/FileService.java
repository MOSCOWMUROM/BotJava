package org.example.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.example.entity.AppDocument;
import org.example.entity.AppPhoto;
import org.example.service.enums.LinkType;

public interface FileService {

    AppDocument processDoc(Message telegramMessage);

    AppPhoto processPhoto(Message telegramMessage);

    String generateLink(Long docId, LinkType linkType);
}
