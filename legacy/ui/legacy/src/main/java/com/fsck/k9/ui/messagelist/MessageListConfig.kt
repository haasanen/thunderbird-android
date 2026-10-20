package com.fsck.k9.ui.messagelist

import app.k9mail.legacy.message.controller.MessageReference
import net.thunderbird.core.android.account.SortType
import net.thunderbird.feature.search.legacy.LocalMessageSearch

data class MessageListConfig(
    val search: LocalMessageSearch,
    val showingThreadedList: Boolean,
    val sortType: SortType,
    val sortAscending: Boolean,
    val sortDateAscending: Boolean,
    val activeMessage: MessageReference?,
    val sortOverrides: Map<MessageReference, MessageSortOverride>,
    // Maximum number of list items to load into memory; -1 = unlimited. Bounds memory on huge folders.
    val messageListLimit: Int = -1,
)

data class MessageSortOverride(
    val isRead: Boolean,
    val isStarred: Boolean,
)
