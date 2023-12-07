package rs.ac.uns.ftn.Bookify.service.interfaces;


import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.Bookify.dto.AccommodationBasicDTO;
import rs.ac.uns.ftn.Bookify.dto.FilterDTO;
import rs.ac.uns.ftn.Bookify.model.Accommodation;
import rs.ac.uns.ftn.Bookify.model.Availability;
import rs.ac.uns.ftn.Bookify.model.PricelistItem;

import java.util.Collection;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public interface IAccommodationService {
    public Collection<Accommodation> getAccommodationsForSearch(Integer persons, String location, Date begin, Date end);
    public long countByLocationAndGuestRange(Integer persons, String location, Date begin, Date end);
    public List<AccommodationBasicDTO> sortAccommodationBasicDTO(List<AccommodationBasicDTO> accommodations, String sort);
    public List<AccommodationBasicDTO> setPrices(List<AccommodationBasicDTO> accommodationBasicDTO, Date begin, Date end, int persons);
    public List<Accommodation> getForFilter(List<Accommodation> accommodations, FilterDTO filter);
    public List<AccommodationBasicDTO> getForPriceRange(List<AccommodationBasicDTO> accommodations, FilterDTO filter);
    public double getTotalPrice(Long id, Date begin, Date end);
    public double getOnePrice(Long id, Date begin, Date end);
    public FileSystemResource getImages(Long id);
    public Accommodation save(Accommodation accommodation);
    public Long addPriceList(Long accommodationId, PricelistItem item);
    public Long addAvailability(Long accommodationId, Availability availability);
    public Collection<PricelistItem> getAccommodationPriceListItems(Long accommodationId);
    public Boolean deletePriceListItem(Long accommodationId, Long priceListItemId);
    public Boolean deleteAvailabilityItem(Long accommodationId, Long priceListItemId);
    public Long updatePriceListItem(Long accommodationId, PricelistItem item);
    public Long updateAvailabilityItem(Long accommodationId, Availability availability);
}
