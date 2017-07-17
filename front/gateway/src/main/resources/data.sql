
INSERT INTO `user` VALUES ('1', 'admin', '$2a$10$4RdTN5/PvtNAAq09UVcYb.1PY.4ddVZ6I.COhj67vbBAARvrEfBxi', '', '', '', '', '');
INSERT INTO `user` VALUES ('2', 'user', '$2a$10$MI83.tIkfyyCAlU6twhg7e.TTAxaxKPf/YgWa1pzghcBp3v4DpsKC', '', '', '', '', '');

INSERT INTO `authority` VALUES ('1', 'admin');
INSERT INTO `authority` VALUES ('2', 'user');

INSERT INTO `user_authority` VALUES ('1', '1');
INSERT INTO `user_authority` VALUES ('1', '2');
INSERT INTO `user_authority` VALUES ('2', '2');

