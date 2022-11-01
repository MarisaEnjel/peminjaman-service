/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.enjel.peminjaman.service.repository;

import com.enjel.peminjaman.service.entity.Peminjaman;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface PeminjamanRepository {
   
    public Peminjaman findByPeminjamanId(Long peminjamanId);

    public Peminjaman save(Peminjaman peminjaman);
}
